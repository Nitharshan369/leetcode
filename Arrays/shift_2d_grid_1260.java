class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int M = grid.length;
        int N = grid[0].length;

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                row.add(0);
            }
            res.add(row);
        }

        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                int pos = r * N + c;
                int newPos = (pos + k) % (M * N);
                int newR = newPos / N;
                int newC = newPos % N;

                res.get(newR).set(newC, grid[r][c]);
            }
        }
        return res;
    }
} 