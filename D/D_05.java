package D;

import java.util.Scanner;

public class D_05 {
    void d05(){
        Scanner scanner = new Scanner(System.in);
        int squareCount = 0; // 정사각형 개수
        int horizontalRectangleCount = 0; // 좌우로 길쭉한 직사각형 개수
        int verticalRectangleCount = 0; // 위아래로 길쭉한 직사각형 개수
        int normalHorizontalRectangleCount = 0; // 일반적인 가로형 직사각형 개수
        int normalVerticalRectangleCount = 0; // 일반적인 세로형 직사각형 개수

        while (true) {
            // 가로 크기 입력
            System.out.print("Enter width, height of Rectangle > ");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            // 0 이하의 값이 입력된 경우, 반복 종료
            if (width <= 0 || height <= 0) {
                break;
            }

            // 직사각형의 종류 판정
            if (width == height) {
                squareCount++;
            } else if (width >= height * 2) {
                horizontalRectangleCount++;
            } else if (height >= width * 2) {
                verticalRectangleCount++;
            } else if (width > height) {
                normalHorizontalRectangleCount++;
            } else {
                normalVerticalRectangleCount++;
            }
        }
        System.out.println("Count of square is "+ squareCount );
        System.out.println("Count of an oblong rectangle from side to side is "+ horizontalRectangleCount);
        System.out.println("Count of an oblong rectangle from top to bottom is "+ verticalRectangleCount);
        System.out.println("Count of a horizontal rectangle is "+ normalHorizontalRectangleCount );
        System.out.println("Count of a vertical rectangle is "+ normalVerticalRectangleCount );
    }
}
