#include <vector>
#include <algorithm>
class Solution {
public:
    int maxDistance(vector<int>& colors) {
        int leng = colors.size();
        int best = 0;
        for (int i = 0; i < leng; i++) {
            for (int j = i + 1; j < leng; j++) {
                if (colors[i] != colors[j]) {
                    best = max(best, abs(i - j));
                }
            }
        }
        return best;
    }
};