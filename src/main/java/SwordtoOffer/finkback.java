package SwordtoOffer;

/**
 * @Author：lanbow
 * @Date:2019/9/1 14:27
 * @Version 1.0
 */
public class finkback {
//    请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
//    如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bccced"的路径，
//    但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || rows < 0 || cols < 0 || str == null || str.length > matrix.length)
            return false;
        boolean visited[] = new boolean[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPath(matrix, rows, cols, i, j, str, visited, index)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isPath(char[] matrix, int rows, int cols, int i, int j, char[] str, boolean[] visited, int index) {
        if (index == str.length) {
            return true;
        }
        boolean flag = false;
        if (i >= 0 && i < rows && j >= 0 && j < cols && !visited[i * cols + j] && matrix[i * cols + j] == str[index]) {
            index++;
            visited[i * cols + j] = true;
            flag =isPath(matrix, rows, cols, i+1, j, str, visited, index)||isPath(matrix, rows, cols, i-1, j, str, visited, index)||
                    isPath(matrix, rows, cols, i, j+1, str, visited, index)||isPath(matrix, rows, cols, i, j-1, str, visited, index);
            if (!flag){
                index--;
                visited[i * cols + j] = false;
            }
        }
        return flag;
    }
//    public int movingCount(int threshold, int rows, int cols)
//    {
//
//    }

    public static void main(String[] args) {
        String str = "ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS";
        char[] matrix = str.toCharArray();
        String str2 = "SGGFIECVAASABCEEJIGOEM";
        char[] c = str2.toCharArray();
        System.out.println(new finkback().hasPath(matrix, 5, 8, c));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(NumberOf1(3));
    }
    public static int NumberOf1(int n) {
        int res = 0;
        while(n!=0){
            res++;
            n=n&(n-1);
        }
        return res;
    }

}
