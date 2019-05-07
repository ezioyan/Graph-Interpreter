public class DrawMain {
    public static void main(String[] args) {
        String filename = "test1.txt";

        try {
            MyUI theUI = new MyUI();
            DrawMain.doFile(filename, theUI);
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void doFile(String file, MyUI theUI) throws Exception {
        FrontEnd frontEnd = new FrontEnd(file);
        int nErr = frontEnd.doParse();

        if(nErr > 0) {
            theUI.showMessage ("semantics error!");
            System.gc();
            return;
        }
        BackEnd be =new BackEnd(frontEnd.getTree(), theUI);
        be.run();
    }
}
