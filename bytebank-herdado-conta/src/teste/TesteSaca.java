public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234,321);
        cc.deposita(1000);
        System.out.println(cc.getSaldo());
        try{
            cc.saca(2000);
            System.out.println(cc.getSaldo());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(cc.getSaldo());
    }
}
