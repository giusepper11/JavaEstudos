public class TestaConexao {
    public static void main(String[] args) {


        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException exp) {
            System.out.println("Erro de conexao");
        }
    }
}


//--------------------------------
/*        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
//            con.fecha();
        } catch (IllegalStateException exp) {
            exp.printStackTrace();

        } finally {
            con.close();
        }*/


