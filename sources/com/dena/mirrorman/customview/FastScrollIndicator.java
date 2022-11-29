package com.dena.mirrorman.customview;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jo.h;
import jo.p;
import nd.b1;
import nd.x0;
import yd.h0;
import yd.j;

/* loaded from: classes2.dex */
public final class FastScrollIndicator extends ConstraintLayout {
    public j U;
    public List<Singer> V;
    public List<h0> W;

    /* renamed from: a0  reason: collision with root package name */
    public String f25335a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Paint f25336b0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FastScrollIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ FastScrollIndicator(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            jo.p.h(r4, r0)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L15
            r2 = 2
            if (r0 == r2) goto L24
            r1 = 3
            if (r0 == r1) goto L15
            goto L1f
        L15:
            yd.j r0 = r3.U
            if (r0 == 0) goto L1c
            r0.c()
        L1c:
            r0 = 0
            r3.f25335a0 = r0
        L1f:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L24:
            float r4 = r4.getY()
            int r4 = (int) r4
            r3.y(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.FastScrollIndicator.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setFastScrollListener(j jVar) {
        p.h(jVar, "listener");
        this.U = jVar;
    }

    public final void setSingerList(List<Singer> list) {
        p.h(list, "singers");
        this.V = list;
        ArrayList arrayList = new ArrayList();
        String initial = list.get(0).getInitial();
        int i10 = 1;
        int i11 = 0;
        for (Singer singer : list) {
            if (p.c(initial, singer.getInitial())) {
                i10++;
            } else {
                int i12 = i11 + i10;
                arrayList.add(new h0(initial, i11, i12, i10));
                initial = singer.getInitial();
                i10 = 0;
                i11 = i12;
            }
        }
        arrayList.add(new h0(initial, i11, i11 + i10, i10));
        this.W = arrayList;
        invalidate();
    }

    public final int w(String str) {
        List<h0> list = this.W;
        if (list != null) {
            for (Object obj : list) {
                if (p.c(((h0) obj).a(), str)) {
                    int indexOf = list.indexOf(obj);
                    float height = (getHeight() * 1.0f) / list.size();
                    return (int) ((height * indexOf) + ((int) ((height / 2.0f) - ((this.f25336b0.getFontMetrics().descent + this.f25336b0.getFontMetrics().ascent) / 2.0f))));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return 0;
    }

    public final int x(String str) {
        List<Singer> list = this.V;
        if (list != null) {
            for (Singer singer : list) {
                if (p.c(singer.getKana(), str)) {
                    List<Singer> list2 = this.V;
                    if (list2 != null) {
                        return list2.indexOf(singer);
                    }
                    return 0;
                }
            }
            return 0;
        }
        return 0;
    }

    public final void y(int i10) {
        h0 h0Var;
        List<h0> list = this.W;
        if (list != null) {
            int height = i10 / (getHeight() / list.size());
            if (height >= list.size()) {
                h0Var = list.get(list.size() - 1);
            } else if (height <= 0) {
                h0Var = list.get(0);
            } else {
                h0Var = list.get(height);
            }
            j jVar = this.U;
            if (jVar != null) {
                jVar.b(x(h0Var.a()));
            }
            int w10 = w(h0Var.a());
            if (w10 == 0) {
                j jVar2 = this.U;
                if (jVar2 != null) {
                    jVar2.c();
                }
                this.f25335a0 = null;
                return;
            }
            String str = this.f25335a0;
            if (str == null || !p.c(str, h0Var.a())) {
                j jVar3 = this.U;
                if (jVar3 != null) {
                    jVar3.a(w10, h0Var.a());
                }
                this.f25335a0 = h0Var.a();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastScrollIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(context.getResources().getDimension(x0.text_size_Micro));
        paint.setColor(-256);
        this.f25336b0 = paint;
        f.e(LayoutInflater.from(context), b1.view_fast_scroll_indicator, this, true);
    }
}
