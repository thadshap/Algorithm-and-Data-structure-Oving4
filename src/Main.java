public class Main {
    public static void main(String args[]) {
        TreNode nr4 = new TreNode(4.0, null, null);
        TreNode nr2 = new TreNode(2.0, null, null);
        TreNode plus = new TreNode("+", nr2, nr4);
        TreNode nr3 = new TreNode(3.0, null, null);
        TreNode gangev = new TreNode("*", nr3, plus);

        TreNode nr2hv = new TreNode(2.0,null,null);
        TreNode nr2hh = new TreNode(2.0,null,null);
        TreNode gangeh = new TreNode("*",nr2hv,nr2hh);
        TreNode nr7 = new TreNode(7.0,null,null);
        TreNode minus = new TreNode("-",nr7,gangeh);

        TreNode rot = new TreNode("/",gangev,minus);

        Tre uttrykstre = new Tre(rot);
        System.out.println(uttrykstre.sum());
        uttrykstre.print();
    }
}
