public class Main {
    public static void main(String[] args) {
        String breakfast = "������� � 09:00";

        if (breakfast.matches("(.*)[0-1][0-9]:[0-5][0-9](.*)")||breakfast.matches("(.*)[2][0-3]:[0-5][0-9](.*)")){
            System.out.println("����� ����");
        }
        else {
            System.out.println("������� ���");
        }
    }
}