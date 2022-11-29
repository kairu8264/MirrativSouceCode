package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class b7 extends a7 {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(nd.z0.osPushWarningView, 1);
        sparseIntArray.put(nd.z0.osPushView, 2);
        sparseIntArray.put(nd.z0.pushLiveSwitchView, 3);
        sparseIntArray.put(nd.z0.pushLiveFollowView, 4);
        sparseIntArray.put(nd.z0.present_box_title_text_view, 5);
        sparseIntArray.put(nd.z0.present_box_body_text_view, 6);
        sparseIntArray.put(nd.z0.present_box_notification_switch, 7);
        sparseIntArray.put(nd.z0.yours_title_text_view, 8);
        sparseIntArray.put(nd.z0.yours_body_text_view, 9);
        sparseIntArray.put(nd.z0.yours_notification_switch, 10);
        sparseIntArray.put(nd.z0.campaign_title_text_view, 11);
        sparseIntArray.put(nd.z0.campaign_body_text_view, 12);
        sparseIntArray.put(nd.z0.campaign_notification_switch, 13);
        sparseIntArray.put(nd.z0.news_title_text_view, 14);
        sparseIntArray.put(nd.z0.news_body_text_view, 15);
        sparseIntArray.put(nd.z0.news_notification_switch, 16);
        sparseIntArray.put(nd.z0.chat_title_text_view, 17);
        sparseIntArray.put(nd.z0.chat_body_text_view, 18);
        sparseIntArray.put(nd.z0.chat_notification_switch, 19);
    }

    public b7(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 20, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.V = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 1L;
        }
        H();
    }

    public b7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[12], (Switch) objArr[13], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[18], (Switch) objArr[19], (AppCompatTextView) objArr[17], (LinearLayout) objArr[0], (AppCompatTextView) objArr[15], (Switch) objArr[16], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[2], (LinearLayout) objArr[1], (AppCompatTextView) objArr[6], (Switch) objArr[7], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (Switch) objArr[3], (AppCompatTextView) objArr[9], (Switch) objArr[10], (AppCompatTextView) objArr[8]);
        this.V = -1L;
        this.H.setTag(null);
        N(view);
        y();
    }
}
