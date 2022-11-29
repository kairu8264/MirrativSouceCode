package s3;

import android.widget.ListView;

/* loaded from: classes.dex */
public class g extends a {
    public final ListView O;

    public g(ListView listView) {
        super(listView);
        this.O = listView;
    }

    @Override // s3.a
    public boolean a(int i10) {
        return false;
    }

    @Override // s3.a
    public boolean b(int i10) {
        ListView listView = this.O;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i10 >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // s3.a
    public void r(int i10, int i11) {
        h.b(this.O, i11);
    }
}
