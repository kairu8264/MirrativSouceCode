package qg;

import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public interface a {
    int b(int i10, int i11, int i12);

    View d(int i10);

    int e(int i10, int i11, int i12);

    int f(View view);

    void g(c cVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View h(int i10);

    void i(int i10, View view);

    int j(View view, int i10, int i11);

    void k(View view, int i10, int i11, c cVar);

    boolean l();

    void setFlexLines(List<c> list);
}
