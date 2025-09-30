public class RestoreFinishingOrder {
    static class Solution {
        public int[] recoverOrder(int[] order, int[] friends) {
            int[] pos = new int[order.length + 1];

            // Luu index tung phan tu trong array order
            for (int i = 0; i < order.length; i++) {
                pos[order[i]] = i;
            }

            //So vi tri friends voi orders o mang pos da luu vi tri roi sap xep lai mang friends
            for (int i = 0; i < friends.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < friends.length; j++) {
                    if (pos[friends[j]] < pos[friends[minIndex]]) {
                        minIndex = j;
                    }
                }
                int temp = friends[i];
                friends[i] = friends[minIndex];
                friends[minIndex] = temp;
            }

            return friends;
        }
    }

    public static void main(String[] args) {
        
    }

}
