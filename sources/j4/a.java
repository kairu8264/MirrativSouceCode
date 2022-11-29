package j4;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;

@Deprecated
/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: w  reason: collision with root package name */
    public static final SparseArray<PowerManager.WakeLock> f37111w = new SparseArray<>();

    /* renamed from: x  reason: collision with root package name */
    public static int f37112x = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f37111w;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f37111w;
        synchronized (sparseArray) {
            int i10 = f37112x;
            int i11 = i10 + 1;
            f37112x = i11;
            if (i11 <= 0) {
                f37112x = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
            sparseArray.put(i10, newWakeLock);
            return startService;
        }
    }
}
