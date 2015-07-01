/**
 *  ++ JC1 Product ++
 */

/**
 * <pre>
 * </pre>
 *
 * @title SyncTest
 * @desc
 * @programID SyncTest.java
 * @cdate 2015. 6. 30.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class SyncTest {

	public static void main(String[] args) {

		System.out.println("== start ==");
        final BlackOrWhite bow = new BlackOrWhite();
        Thread white = new Thread() {
            public void run() {
            	System.out.println("===> white run");
                while (true) {
                    bow.white();
                }
            }
        };

        Thread black = new Thread() {
            public void run() {
            	System.out.println("===> black run");
                while (true) {
                    bow.black();
                }
            }
        };

        System.out.println("==> white start");
        white.start();

        System.out.println("==> black start");
        black.start();
    }

}
