package apresentacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinMustache;
import negocio.Beverage;
import negocio.Decaf;
import negocio.Espresso;
import negocio.Milk;
import negocio.Sugar;

public class MainJavalin {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.fileRenderer(new JavalinMustache());
            config.routes.get("/", ctx -> {
                Map<String, Object> map = new HashMap();
                List<String> vetBebida = new ArrayList<String>();
                vetBebida.add("Espresso");
                vetBebida.add("Decaf");
                map.put("vetBebida", vetBebida);
                List<String> vetIngrediente = new ArrayList<String>();
                vetIngrediente.add("Leite");
                vetIngrediente.add("Acucar");
                map.put("vetIngrediente", vetIngrediente);
                ctx.render("/templates/index.html", map);
            });
            config.routes.post("/criar", ctx -> {
                HashMap<String, Beverage> beverageMap = new HashMap<>();
                beverageMap.put("Espresso", new Espresso());
                beverageMap.put("Decaf", new Decaf());
                Beverage beverage = beverageMap.get(ctx.formParam("bebida"));

                int qtdeAcucar = 0;
                try {
                    qtdeAcucar = Integer.parseInt(ctx.formParam("AcucarQtde"));
                } catch (Exception e) {
                    qtdeAcucar = 0;
                }
                int qtdeLeite = 0;
                try {
                    qtdeLeite = Integer.parseInt(ctx.formParam("LeiteQtde"));

                } catch (Exception e) {
                    qtdeLeite = 0;
                }
                for (int i = 0; i < qtdeAcucar; i++) {
                    beverage = new Sugar(beverage);
                }
                for (int i = 0; i < qtdeLeite; i++) {
                    beverage = new Milk(beverage);
                }
                ctx.html("Extrato do Pedido:" + beverage.getDescription() + "<br> Custo Total:"
                        + String.format("%.2f", beverage.cost()));
            });
        }).start(7070);

    }

}
