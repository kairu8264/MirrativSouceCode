package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import o3.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: w  reason: collision with root package name */
    public final Calendar f27509w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f27510x;

    /* loaded from: classes3.dex */
    public class a extends o3.a {
        public a() {
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            cVar.d0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean d(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    public final void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter2().i());
        } else if (i10 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public m getAdapter2() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a10;
        int c10;
        int a11;
        int c11;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter2 = getAdapter2();
        d<?> dVar = adapter2.f27580x;
        c cVar = adapter2.f27582z;
        Long item = adapter2.getItem(adapter2.b());
        Long item2 = adapter2.getItem(adapter2.i());
        for (n3.d<Long, Long> dVar2 : dVar.W0()) {
            Long l10 = dVar2.f41559a;
            if (l10 != null) {
                if (dVar2.f41560b != null) {
                    long longValue = l10.longValue();
                    long longValue2 = dVar2.f41560b.longValue();
                    if (!d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean d10 = nj.l.d(this);
                        if (longValue < item.longValue()) {
                            a10 = adapter2.b();
                            if (adapter2.f(a10)) {
                                c10 = 0;
                            } else if (!d10) {
                                c10 = materialCalendarGridView.getChildAt(a10 - 1).getRight();
                            } else {
                                c10 = materialCalendarGridView.getChildAt(a10 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f27509w.setTimeInMillis(longValue);
                            a10 = adapter2.a(materialCalendarGridView.f27509w.get(5));
                            c10 = c(materialCalendarGridView.getChildAt(a10));
                        }
                        if (longValue2 > item2.longValue()) {
                            a11 = Math.min(adapter2.i(), getChildCount() - 1);
                            if (adapter2.g(a11)) {
                                c11 = getWidth();
                            } else if (!d10) {
                                c11 = materialCalendarGridView.getChildAt(a11).getRight();
                            } else {
                                c11 = materialCalendarGridView.getChildAt(a11).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f27509w.setTimeInMillis(longValue2);
                            a11 = adapter2.a(materialCalendarGridView.f27509w.get(5));
                            c11 = c(materialCalendarGridView.getChildAt(a11));
                        }
                        int itemId = (int) adapter2.getItemId(a10);
                        int itemId2 = (int) adapter2.getItemId(a11);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + cVar.f27528a.c();
                            int bottom = childAt.getBottom() - cVar.f27528a.b();
                            if (!d10) {
                                i10 = numColumns > a10 ? 0 : c10;
                                width = a11 > numColumns2 ? getWidth() : c11;
                            } else {
                                int i11 = a11 > numColumns2 ? 0 : c11;
                                width = numColumns > a10 ? getWidth() : c10;
                                i10 = i11;
                            }
                            canvas.drawRect(i10, top, width, bottom, cVar.f27535h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (super.onKeyDown(i10, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i10) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f27510x) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27509w = s.k();
        if (i.Q3(getContext())) {
            setNextFocusLeftId(wi.f.f58835a);
            setNextFocusRightId(wi.f.f58837c);
        }
        this.f27510x = i.R3(getContext());
        c0.r0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof m) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
    }
}
