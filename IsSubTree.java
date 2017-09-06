package cn.it.zuo;

public class IsSubTree {
	public boolean isSubTree(TreeNode t1, TreeNode t2){
		String str1 = serialByPre(t1);
		String str2 = serialByPre(t2);
		return getIndexOf(str1, str2) != -1 ;									
	}

	private String serialByPre(TreeNode head) {
		// TODO Auto-generated method stub
		if (head == null) {
			return "#!";
		}
		String res = head.value + "!";
		res += serialByPre(head.left);
		res += serialByPre(head.right);
		return res;
	}
	public int getIndexOf(String s, String m){
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1 ;
		}
		char[] ss = s.toCharArray();
		char[] mm = m.toCharArray();
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(mm);
		while(si < ss.length && mi < mm.length){
			if (ss[si] == mm[mi]) {
				si++;
				mi++;
			}else if(next[mi] == -1){
				si++;
			}else{
				mi = next[mi];
			}
		}
		return mi == mm.length ? si -mi : -1;					
	}

	private int[] getNextArray(char[] ms) {
		// TODO Auto-generated method stub
		if (ms.length == 1) {
			return new int[] {-1};
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while(pos < next.length){
			if (ms[pos-1] == ms[cn]) {
				next[pos++] = ++cn;
				
			}else if (cn >0) {
				cn = next[cn];
			}else{
				next[pos++] = 0;
			}
		}
		return next;
	}
}
