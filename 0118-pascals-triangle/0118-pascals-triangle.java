class Solution {
    public List<List<Integer>> generate(int numRows) {

        // This will store the entire Pascal's Triangle
        List<List<Integer>> ans = new ArrayList<>();

        // Create each row one by one
        for (int i = 0; i < numRows; i++) {

            // Current row
            List<Integer> row = new ArrayList<>();

            // Every row starts with 1
            row.add(1);

            // Fill the middle elements
            // i = row number (starting from 0)
            for (int j = 1; j < i; j++) {

                // Previous row
                List<Integer> prev = ans.get(i - 1);

                // Sum of the two numbers above
                row.add(prev.get(j - 1) + prev.get(j));
            }

            // Every row except the first ends with 1
            if (i > 0) {
                row.add(1);
            }

            // Add the completed row to the answer
            ans.add(row);
        }

        return ans;
    }
}