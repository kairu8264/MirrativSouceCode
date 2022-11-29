package xj;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import nj.j;
import wi.k;
import wi.l;

/* loaded from: classes3.dex */
public class e extends AppCompatAutoCompleteTextView {

    /* renamed from: w  reason: collision with root package name */
    public final ListPopupWindow f60349w;

    /* renamed from: x  reason: collision with root package name */
    public final AccessibilityManager f60350x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f60351y;

    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            e.this.e(i10 < 0 ? e.this.f60349w.getSelectedItem() : e.this.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = e.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = e.this.f60349w.getSelectedView();
                    i10 = e.this.f60349w.getSelectedItemPosition();
                    j10 = e.this.f60349w.getSelectedItemId();
                }
                onItemClickListener.onItemClick(e.this.f60349w.getListView(), view, i10, j10);
            }
            e.this.f60349w.dismiss();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58765b);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c10 = c();
        int i10 = 0;
        if (adapter == null || c10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f60349w.getSelectedItemPosition()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, c10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable background = this.f60349w.getBackground();
        if (background != null) {
            background.getPadding(this.f60351y);
            Rect rect = this.f60351y;
            i11 += rect.left + rect.right;
        }
        return i11 + c10.getEndIconView().getMeasuredWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ListAdapter & Filterable> void e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout c10 = c();
        if (c10 != null && c10.O()) {
            return c10.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c10 = c();
        if (c10 != null && c10.O() && super.getHint() == null && nj.e.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f60349w.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f60350x;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f60349w.show();
        } else {
            super.showDropDown();
        }
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(yj.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f60351y = new Rect();
        Context context2 = getContext();
        TypedArray h10 = j.h(context2, attributeSet, l.R2, i10, k.f58910g, new int[0]);
        int i11 = l.S2;
        if (h10.hasValue(i11) && h10.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f60350x = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f60349w = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        h10.recycle();
    }
}
