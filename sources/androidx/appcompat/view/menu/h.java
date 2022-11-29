package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import o3.c0;

/* loaded from: classes.dex */
public class h {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final e mMenu;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private k.d mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private i.a mPresenterCallback;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.onDismiss();
        }
    }

    public h(Context context, e eVar) {
        this(context, eVar, null, false, d.a.f28635l0, 0);
    }

    private k.d createPopup() {
        k.d kVar;
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.mContext.getResources().getDimensionPixelSize(d.d.f28675c)) {
            kVar = new b(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        } else {
            kVar = new k(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        kVar.a(this.mMenu);
        kVar.j(this.mInternalOnDismissListener);
        kVar.e(this.mAnchorView);
        kVar.setCallback(this.mPresenterCallback);
        kVar.g(this.mForceShowIcon);
        kVar.h(this.mDropDownGravity);
        return kVar;
    }

    private void showPopup(int i10, int i11, boolean z10, boolean z11) {
        k.d popup = getPopup();
        popup.k(z11);
        if (z10) {
            if ((o3.f.b(this.mDropDownGravity, c0.E(this.mAnchorView)) & 7) == 5) {
                i10 -= this.mAnchorView.getWidth();
            }
            popup.i(i10);
            popup.l(i11);
            int i12 = (int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.f(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    public k.d getPopup() {
        if (this.mPopup == null) {
            this.mPopup = createPopup();
        }
        return this.mPopup;
    }

    public boolean isShowing() {
        k.d dVar = this.mPopup;
        return dVar != null && dVar.isShowing();
    }

    public void onDismiss() {
        this.mPopup = null;
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z10) {
        this.mForceShowIcon = z10;
        k.d dVar = this.mPopup;
        if (dVar != null) {
            dVar.g(z10);
        }
    }

    public void setGravity(int i10) {
        this.mDropDownGravity = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setPresenterCallback(i.a aVar) {
        this.mPresenterCallback = aVar;
        k.d dVar = this.mPopup;
        if (dVar != null) {
            dVar.setCallback(aVar);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(0, 0, false, false);
        return true;
    }

    public h(Context context, e eVar, View view) {
        this(context, eVar, view, false, d.a.f28635l0, 0);
    }

    public h(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public void show(int i10, int i11) {
        if (!tryShow(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.mDropDownGravity = 8388611;
        this.mInternalOnDismissListener = new a();
        this.mContext = context;
        this.mMenu = eVar;
        this.mAnchorView = view;
        this.mOverflowOnly = z10;
        this.mPopupStyleAttr = i10;
        this.mPopupStyleRes = i11;
    }

    public boolean tryShow(int i10, int i11) {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(i10, i11, true, true);
        return true;
    }
}
