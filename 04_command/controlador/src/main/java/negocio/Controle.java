package negocio;

public class Controle {
    private Command slots[];

    public Controle(){
        this.slots = new Command[3];
        for (int i = 0; i < slots.length; i++) {
            this.slots[i] = new NoCommand();
        }
        
    }

    public void setSlot(int i, Command slot) {
        this.slots[i] = slot;
    }

    public void on(int i){
        this.slots[i].execute();

    }

    public void off(int i){
        this.slots[i].undo();
    }

}
