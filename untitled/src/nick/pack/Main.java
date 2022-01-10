package nick.pack;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Запуск ракеты через:");
        for (int i = 10; i >= 0; i--){
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Поехали!");
    }
}

