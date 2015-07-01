/**
 *  ++ JC1 Product ++
 */

/**
 * <pre>
 * </pre>
 *
 * @title BlackOrWhite
 * @desc
 * @programID BlackOrWhite.java
 * @cdate 2015. 6. 30.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class BlackOrWhite {
	private String str;
    private final String BLACK = "black";
    private final String WHITE = "white";

    public synchronized void black(){
        setColor(BLACK);
        try {
            long sleep = (long) (Math.random()*100L);
            System.out.println("====> black sleep : " + sleep);
            Thread.sleep(sleep);
            if (!str.equals(BLACK)) {
                System.out.println("+++++++++++++++++broken!!++++++++++++++++++++");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void white(){
        setColor(WHITE);
        try {
            long sleep = (long) (Math.random()*100L);
            System.out.println("====> white sleep : " + sleep);
            Thread.sleep(sleep);
            if (!str.equals(WHITE)) {
                System.out.println("+++++++++++++++++broken!!++++++++++++++++++++");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setColor(String color){
    	str = color;
    }

}
