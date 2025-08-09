class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};

        int s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i < answers.length; i++) {
            int a = answers[i];
            if (a == p1[i % p1.length]) s1++;
            if (a == p2[i % p2.length]) s2++;
            if (a == p3[i % p3.length]) s3++;
        }

        int max = Math.max(s1, Math.max(s2, s3));
        int cnt = (s1 == max ? 1 : 0) + (s2 == max ? 1 : 0) + (s3 == max ? 1 : 0);

        int[] res = new int[cnt];
        int k = 0;
        if (s1 == max) res[k++] = 1;
        if (s2 == max) res[k++] = 2;
        if (s3 == max) res[k++] = 3;
        return res;
    }
}
