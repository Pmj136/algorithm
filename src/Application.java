/**
 * @author 彭明久
 * @since 2021-01-12
 */
public class Application {
    public static void main(String[] args) {
        int n = 100;
        show(n);
        for (int i = 0; i < n; i++)
            show(i);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                System.out.println(j);

    }

    private static void show(int i) {
        for (int j = 0; j < i; j++)
            System.out.println(i);
    }

    void func(int n) {
        int i = 1;
        while (i <= n)
            i = i * 2;
        //n=20
        //1 2 3 4 5
        //2 4 8 16 32


        //2^m=n => m=log(2)n =>O(log(2)n)
    }


}
