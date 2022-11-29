package ai;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.ActivityChooserModel;
import java.util.List;

/* loaded from: classes3.dex */
public final class c72 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2744a;

    /* renamed from: b  reason: collision with root package name */
    public final fs f2745b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Parcelable> f2746c;

    public c72(Context context, fs fsVar, List<Parcelable> list) {
        this.f2744a = context;
        this.f2745b = fsVar;
        this.f2746c = list;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle2 = bundle;
        if (gz.f4654a.e().booleanValue()) {
            Bundle bundle3 = new Bundle();
            wg.t.d();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f2744a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    str = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle3.putString(ActivityChooserModel.ATTRIBUTE_ACTIVITY, str);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f2745b.A);
            bundle4.putInt("height", this.f2745b.f4174x);
            bundle3.putBundle("size", bundle4);
            if (this.f2746c.size() > 0) {
                List<Parcelable> list = this.f2746c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
