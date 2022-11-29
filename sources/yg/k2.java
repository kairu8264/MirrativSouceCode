package yg;

import ai.dt;
import ai.ft;
import ai.nj0;
import ai.ox;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

@TargetApi(24)
/* loaded from: classes3.dex */
public class k2 extends i2 {
    public static final boolean t(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // yg.e
    public final boolean o(Activity activity, Configuration configuration) {
        if (((Boolean) ft.c().c(ox.f8024k3)).booleanValue()) {
            if (((Boolean) ft.c().c(ox.f8040m3)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            dt.a();
            int q10 = nj0.q(activity, configuration.screenHeightDp);
            int q11 = nj0.q(activity, configuration.screenWidthDp);
            wg.t.d();
            DisplayMetrics f02 = d2.f0((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i10 = f02.heightPixels;
            int i11 = f02.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) ft.c().c(ox.f8008i3)).intValue();
            return (t(i10, q10 + dimensionPixelSize, round) && t(i11, q11, round)) ? false : true;
        }
        return false;
    }
}
