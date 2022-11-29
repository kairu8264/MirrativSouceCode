package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.HashMap;
import t2.h;

/* loaded from: classes.dex */
public abstract class b extends View {
    public boolean A;
    public String B;
    public String C;
    public View[] D;
    public HashMap<Integer, String> E;

    /* renamed from: w  reason: collision with root package name */
    public int[] f14807w;

    /* renamed from: x  reason: collision with root package name */
    public int f14808x;

    /* renamed from: y  reason: collision with root package name */
    public Context f14809y;

    /* renamed from: z  reason: collision with root package name */
    public h f14810z;

    public b(Context context) {
        super(context);
        this.f14807w = new int[32];
        this.A = false;
        this.D = null;
        this.E = new HashMap<>();
        this.f14809y = context;
        m(null);
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f14809y == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int k10 = k(trim);
        if (k10 != 0) {
            this.E.put(Integer.valueOf(k10), trim);
            e(k10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 23);
        sb2.append("Could not find id of \"");
        sb2.append(trim);
        sb2.append("\"");
        Log.w("ConstraintHelper", sb2.toString());
    }

    public final void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f14808x + 1;
        int[] iArr = this.f14807w;
        if (i11 > iArr.length) {
            this.f14807w = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f14807w;
        int i12 = this.f14808x;
        iArr2[i12] = i10;
        this.f14808x = i12 + 1;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || this.f14809y == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f14744b0)) {
                if (childAt.getId() == -1) {
                    String simpleName = childAt.getClass().getSimpleName();
                    StringBuilder sb2 = new StringBuilder(simpleName.length() + 42);
                    sb2.append("to use ConstraintTag view ");
                    sb2.append(simpleName);
                    sb2.append(" must have an ID");
                    Log.w("ConstraintHelper", sb2.toString());
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f14807w, this.f14808x);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i10 = 0; i10 < this.f14808x; i10++) {
            View j10 = constraintLayout.j(this.f14807w[i10]);
            if (j10 != null) {
                j10.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    j10.setTranslationZ(j10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f14809y.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object h10 = constraintLayout.h(0, str);
            if (h10 instanceof Integer) {
                i10 = ((Integer) h10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = x2.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f14809y.getResources().getIdentifier(str, TtmlNode.ATTR_ID, this.f14809y.getPackageName()) : i10;
    }

    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.D;
        if (viewArr == null || viewArr.length != this.f14808x) {
            this.D = new View[this.f14808x];
        }
        for (int i10 = 0; i10 < this.f14808x; i10++) {
            this.D[i10] = constraintLayout.j(this.f14807w[i10]);
        }
        return this.D;
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x2.d.f59531m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == x2.d.f59639y1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.B = string;
                    setIds(string);
                } else if (index == x2.d.f59648z1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.C = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(t2.e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.B;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.C;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.A) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int j10;
        if (isInEditMode()) {
            setIds(this.B);
        }
        h hVar = this.f14810z;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i10 = 0; i10 < this.f14808x; i10++) {
            int i11 = this.f14807w[i10];
            View j11 = constraintLayout.j(i11);
            if (j11 == null && (j10 = j(constraintLayout, (str = this.E.get(Integer.valueOf(i11))))) != 0) {
                this.f14807w[i10] = j10;
                this.E.put(Integer.valueOf(j10), str);
                j11 = constraintLayout.j(j10);
            }
            if (j11 != null) {
                this.f14810z.b(constraintLayout.k(j11));
            }
        }
        this.f14810z.a(constraintLayout.f14738y);
    }

    public void s() {
        if (this.f14810z == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f14782u0 = (t2.e) this.f14810z;
        }
    }

    public void setIds(String str) {
        this.B = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f14808x = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.C = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f14808x = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.B = null;
        this.f14808x = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.B == null) {
            e(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14807w = new int[32];
        this.A = false;
        this.D = null;
        this.E = new HashMap<>();
        this.f14809y = context;
        m(attributeSet);
    }
}
