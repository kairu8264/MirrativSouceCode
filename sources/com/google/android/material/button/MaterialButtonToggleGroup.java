package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import nj.l;
import o3.c0;
import o3.i;
import p3.c;
import tj.k;
import wi.k;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String G = MaterialButtonToggleGroup.class.getSimpleName();
    public static final int H = k.f58927x;
    public final Comparator<MaterialButton> A;
    public Integer[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;

    /* renamed from: w  reason: collision with root package name */
    public final List<d> f27454w;

    /* renamed from: x  reason: collision with root package name */
    public final c f27455x;

    /* renamed from: y  reason: collision with root package name */
    public final f f27456y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashSet<e> f27457z;

    /* loaded from: classes3.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes3.dex */
    public class b extends o3.a {
        public b() {
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            cVar.e0(c.C0699c.a(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes3.dex */
    public class c implements MaterialButton.a {
        public c() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z10) {
            if (MaterialButtonToggleGroup.this.C) {
                return;
            }
            if (MaterialButtonToggleGroup.this.D) {
                MaterialButtonToggleGroup.this.F = z10 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z10)) {
                MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: e  reason: collision with root package name */
        public static final tj.c f27461e = new tj.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public tj.c f27462a;

        /* renamed from: b  reason: collision with root package name */
        public tj.c f27463b;

        /* renamed from: c  reason: collision with root package name */
        public tj.c f27464c;

        /* renamed from: d  reason: collision with root package name */
        public tj.c f27465d;

        public d(tj.c cVar, tj.c cVar2, tj.c cVar3, tj.c cVar4) {
            this.f27462a = cVar;
            this.f27463b = cVar3;
            this.f27464c = cVar4;
            this.f27465d = cVar2;
        }

        public static d a(d dVar) {
            tj.c cVar = f27461e;
            return new d(cVar, dVar.f27465d, cVar, dVar.f27464c);
        }

        public static d b(d dVar, View view) {
            return l.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            tj.c cVar = dVar.f27462a;
            tj.c cVar2 = dVar.f27465d;
            tj.c cVar3 = f27461e;
            return new d(cVar, cVar2, cVar3, cVar3);
        }

        public static d d(d dVar) {
            tj.c cVar = f27461e;
            return new d(cVar, cVar, dVar.f27463b, dVar.f27464c);
        }

        public static d e(d dVar, View view) {
            return l.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            tj.c cVar = dVar.f27462a;
            tj.c cVar2 = f27461e;
            return new d(cVar, cVar2, dVar.f27463b, cVar2);
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    /* loaded from: classes3.dex */
    public class f implements MaterialButton.b {
        public f() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58786w);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (p(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && p(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setCheckedId(int i10) {
        this.F = i10;
        l(i10, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(c0.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.f27455x);
        materialButton.setOnPressedChangeListenerInternal(this.f27456y);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void t(k.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.E(dVar.f27462a).u(dVar.f27465d).I(dVar.f27463b).y(dVar.f27464c);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(G, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        tj.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f27454w.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        c0.r0(materialButton, new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.f27457z.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.D) {
            return this.F;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton m10 = m(i10);
            if (m10.isChecked()) {
                arrayList.add(Integer.valueOf(m10.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.B;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(G, "Child order wasn't updated");
        return i11;
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton m10 = m(i10);
            int min = Math.min(m10.getStrokeWidth(), m(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams i11 = i(m10);
            if (getOrientation() == 0) {
                i.c(i11, 0);
                i.d(i11, -min);
                i11.topMargin = 0;
            } else {
                i11.bottomMargin = 0;
                i11.topMargin = -min;
                i.d(i11, 0);
            }
            m10.setLayoutParams(i11);
        }
        r(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void j(int i10, boolean z10) {
        MaterialButton materialButton = (MaterialButton) findViewById(i10);
        if (materialButton != null) {
            materialButton.setChecked(z10);
        }
    }

    public void k() {
        this.C = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton m10 = m(i10);
            m10.setChecked(false);
            l(m10.getId(), false);
        }
        this.C = false;
        setCheckedId(-1);
    }

    public final void l(int i10, boolean z10) {
        Iterator<e> it = this.f27457z.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    public final MaterialButton m(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final int n(View view) {
        if (view instanceof MaterialButton) {
            int i10 = 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                if (getChildAt(i11) == view) {
                    return i10;
                }
                if ((getChildAt(i11) instanceof MaterialButton) && p(i11)) {
                    i10++;
                }
            }
            return -1;
        }
        return -1;
    }

    public final d o(int i10, int i11, int i12) {
        d dVar = this.f27454w.get(i10);
        if (i11 == i12) {
            return dVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? d.e(dVar, this) : d.f(dVar);
        } else if (i10 == i12) {
            return z10 ? d.b(dVar, this) : d.a(dVar);
        } else {
            return null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.F;
        if (i10 != -1) {
            j(i10, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p3.c.M0(accessibilityNodeInfo).d0(c.b.a(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        w();
        h();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.f27455x);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f27454w.remove(indexOfChild);
        }
        w();
        h();
    }

    public final boolean p(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public boolean q() {
        return this.D;
    }

    public final void r(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        i.c(layoutParams, 0);
        i.d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    public final void s(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.C = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.C = false;
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.E = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            k();
        }
    }

    public final boolean u(int i10, boolean z10) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.E && checkedButtonIds.isEmpty()) {
            s(i10, true);
            this.F = i10;
            return false;
        }
        if (z10 && this.D) {
            checkedButtonIds.remove(Integer.valueOf(i10));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                s(intValue, false);
                l(intValue, false);
            }
        }
        return true;
    }

    public final void v() {
        TreeMap treeMap = new TreeMap(this.A);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(m(i10), Integer.valueOf(i10));
        }
        this.B = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton m10 = m(i10);
            if (m10.getVisibility() != 8) {
                k.b v10 = m10.getShapeAppearanceModel().v();
                t(v10, o(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                m10.setShapeAppearanceModel(v10.m());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.H
            android.content.Context r7 = yj.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f27454w = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f27455x = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f27456y = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f27457z = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.A = r7
            r7 = 0
            r6.C = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = wi.l.f59051n3
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = nj.j.h(r0, r1, r2, r3, r4, r5)
            int r9 = wi.l.f59078q3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = wi.l.f59060o3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.F = r9
            int r9 = wi.l.f59069p3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.E = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            o3.c0.C0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
