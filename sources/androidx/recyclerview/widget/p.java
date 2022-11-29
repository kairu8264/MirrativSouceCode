package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f16316a = new p();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float y10 = o3.c0.y(childAt);
                if (y10 > f10) {
                    f10 = y10;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.o
    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i10 = u4.c.f54368a;
            Object tag = view.getTag(i10);
            if (tag instanceof Float) {
                o3.c0.z0(view, ((Float) tag).floatValue());
            }
            view.setTag(i10, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.o
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.o
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21 && z10) {
            int i11 = u4.c.f54368a;
            if (view.getTag(i11) == null) {
                Float valueOf = Float.valueOf(o3.c0.y(view));
                o3.c0.z0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i11, valueOf);
            }
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.o
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }
}
