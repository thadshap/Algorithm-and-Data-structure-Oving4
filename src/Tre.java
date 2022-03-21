
public class Tre {
    TreNode rot;

    public Tre() {
        rot = null;
    }

    public Tre(TreNode rot) {
        this.rot = rot;
    }

    public double sum() {
        if (rot == null) return 0;
        return sumrek(rot);

    }

    //Postorden
    private double sumrek(TreNode n) {
        if (n.venstre == null && n.høyre == null) return (double) n.element;
        return operasjon(n.element, sumrek(n.venstre), sumrek(n.høyre));
    }

    private double operasjon(Object op, double v, double h) {
        switch (op.toString()) {
            case "+":
                return v + h;
            case "-":
                return v - h;
            case "*":
                return v * h;
            case "/":
                return v / h;
            default:
                throw new IllegalArgumentException(op.toString());
        }
    }

    public void print() {
        if (rot == null) return;
        printOut(rot);
    }

    //Inorden
    private void printOut(TreNode n) {
        if (n.venstre != null) {
            System.out.print("(");
            printOut(n.venstre);
        }
        System.out.print(n.element + " ");
        if (n.høyre != null) {
            printOut(n.høyre);
            System.out.print(")");
        }
    }
}