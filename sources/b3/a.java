package b3;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends c3.a {

    /* renamed from: d  reason: collision with root package name */
    public static d f16767d;

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0094a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String[] f16768w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Activity f16769x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f16770y;

        public RunnableC0094a(String[] strArr, Activity activity, int i10) {
            this.f16768w = strArr;
            this.f16769x = activity;
            this.f16770y = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f16768w.length];
            PackageManager packageManager = this.f16769x.getPackageManager();
            String packageName = this.f16769x.getPackageName();
            int length = this.f16768w.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f16768w[i10], packageName);
            }
            ((c) this.f16769x).onRequestPermissionsResult(this.f16770y, this.f16768w, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Activity f16771w;

        public b(Activity activity) {
            this.f16771w = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16771w.isFinishing() || b3.c.i(this.f16771w)) {
                return;
            }
            this.f16771w.recreate();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a1(int i10);
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void p(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            activity.recreate();
        } else if (i10 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else if (b3.c.i(activity)) {
        } else {
            activity.recreate();
        }
    }

    public static void q(Activity activity, String[] strArr, int i10) {
        d dVar = f16767d;
        if (dVar == null || !dVar.a(activity, strArr, i10)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).a1(i10);
                }
                activity.requestPermissions(strArr, i10);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0094a(strArr, activity, i10));
            }
        }
    }

    public static <T extends View> T r(Activity activity, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i10);
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static boolean s(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void t(Activity activity, Intent intent, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i10, bundle);
        } else {
            activity.startActivityForResult(intent, i10);
        }
    }

    public static void u(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
        }
    }
}
