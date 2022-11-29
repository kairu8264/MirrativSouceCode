package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15837a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c f15838b = new C0069b();

    /* loaded from: classes.dex */
    public class a implements c {
        @Override // androidx.profileinstaller.b.c
        public void a(int i10, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0069b implements c {
        @Override // androidx.profileinstaller.b.c
        public void a(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 != 6 && i10 != 7 && i10 != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i10, Object obj);
    }

    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, null);
    }

    public static boolean d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (file2.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = readLong == packageInfo.lastUpdateTime;
                if (z10) {
                    cVar.a(2, null);
                }
                return z10;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public static void f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void g(Executor executor, final c cVar, final int i10, final Object obj) {
        executor.execute(new Runnable() { // from class: t4.e
            @Override // java.lang.Runnable
            public final void run() {
                b.c.this.a(i10, obj);
            }
        });
    }

    public static void h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        if (Build.VERSION.SDK_INT < 19) {
            g(executor, cVar, 3, null);
            return;
        }
        androidx.profileinstaller.a aVar = new androidx.profileinstaller.a(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (aVar.d() && aVar.f().i().j()) {
            f(packageInfo, file);
        }
    }

    public static void i(Context context) {
        j(context, com.google.android.exoplayer2.offline.a.f26900w, f15837a);
    }

    public static void j(Context context, Executor executor, c cVar) {
        k(context, executor, cVar, false);
    }

    public static void k(Context context, Executor executor, c cVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            h(assets, packageName, packageInfo, filesDir, name, executor, cVar);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.a(7, e10);
        }
    }

    public static void l(Context context, Executor executor, c cVar) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            g(executor, cVar, 7, e10);
        }
    }
}
