public class Main {
    public static void main(String[] args) {
        int[] lotto45 = new int[6];
        boolean[] visit = new boolean[45];
        int index = 0; //로또배열 안에 값을 넣어주는 순서

        while(index < 6){
            int num = (int) (Math.random() * 44); // 공을 뽑았다!
            if (!visit[num]) {
                lotto45[index] = num + 1;
                index++;
                visit[num] = true;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%s번째 공은 %s 입니다.", i+1, lotto45[i]));
        }
    }
}