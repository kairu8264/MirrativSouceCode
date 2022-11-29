package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class f extends e {

    /* renamed from: b0  reason: collision with root package name */
    public static final ViewDataBinding.i f1433b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f1434c0;
    public final RelativeLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f1435a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1434c0 = sparseIntArray;
        sparseIntArray.put(nd.z0.f42269bf, 1);
        sparseIntArray.put(nd.z0.f42282ef, 2);
        sparseIntArray.put(nd.z0.toolbar_group_user_num, 3);
        sparseIntArray.put(nd.z0.timeline, 4);
        sparseIntArray.put(nd.z0.tutorial, 5);
        sparseIntArray.put(nd.z0.avatars, 6);
        sparseIntArray.put(nd.z0.avatar2, 7);
        sparseIntArray.put(nd.z0.avatar1, 8);
        sparseIntArray.put(nd.z0.has_new_message, 9);
        sparseIntArray.put(nd.z0.input_container, 10);
        sparseIntArray.put(nd.z0.text_field, 11);
        sparseIntArray.put(nd.z0.send, 12);
        sparseIntArray.put(nd.z0.settings, 13);
        sparseIntArray.put(nd.z0.settings_bg, 14);
        sparseIntArray.put(nd.z0.settings_users, 15);
        sparseIntArray.put(nd.z0.settings_invite_users, 16);
        sparseIntArray.put(nd.z0.settings_invite_users_text, 17);
        sparseIntArray.put(nd.z0.settings_push, 18);
        sparseIntArray.put(nd.z0.settings_push_icon, 19);
        sparseIntArray.put(nd.z0.settings_push_text, 20);
        sparseIntArray.put(nd.z0.settings_edit_group, 21);
        sparseIntArray.put(nd.z0.settings_hide_room, 22);
        sparseIntArray.put(nd.z0.settings_show_room, 23);
        sparseIntArray.put(nd.z0.settings_leave_group, 24);
    }

    public f(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f1433b0, f1434c0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f1435a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1435a0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1435a0 = 1L;
        }
        H();
    }

    public f(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[7], (RelativeLayout) objArr[6], (AppCompatTextView) objArr[9], (LinearLayout) objArr[10], (AppCompatButton) objArr[12], (RelativeLayout) objArr[13], (FrameLayout) objArr[14], (LinearLayout) objArr[21], (LinearLayout) objArr[22], (LinearLayout) objArr[16], (AppCompatTextView) objArr[17], (LinearLayout) objArr[24], (LinearLayout) objArr[18], (AppCompatImageView) objArr[19], (AppCompatTextView) objArr[20], (LinearLayout) objArr[23], (LinearLayout) objArr[15], (EditText) objArr[11], (RecyclerView) objArr[4], (Toolbar) objArr[1], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (RelativeLayout) objArr[5]);
        this.f1435a0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.Z = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
