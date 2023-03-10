public class Main {
    public static void main(String[] args) {

            int[] lotto45 = new int[6]; //인생을 바꿔 줄 번호가 들어갈 배열
            boolean[] visit = new boolean[45]; //boolean타입 배열의 초기값은 False로 들어간다
            int index = 0; //로또배열 안에 값을 넣어주는 순서

            while(index < 6){
                int num = (int) (Math.random() * 44); // 공을 뽑는다!
                if (!visit[num]) { //visit[num]값이 flase일때 입장
                    lotto45[index] = num + 1; //random값은 0~44(45개)중 1개가 나오므로 1을 더해 주었다
                    index++;
                    visit[num] = true; // visit[num] 값을 true로 바꿔 중복을 방지한다
                }
            }

            for (int i = 0; i < 6; i++) {
                System.out.println(String.format("%s번째 공은 %s 입니다.", i+1, lotto45[i]));
            }
        }

}