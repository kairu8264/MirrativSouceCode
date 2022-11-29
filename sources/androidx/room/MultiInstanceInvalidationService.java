package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: w  reason: collision with root package name */
    public int f16357w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap<Integer, String> f16358x = new HashMap<>();

    /* renamed from: y  reason: collision with root package name */
    public final RemoteCallbackList<androidx.room.a> f16359y = new a();

    /* renamed from: z  reason: collision with root package name */
    public final b.a f16360z = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<androidx.room.a> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(androidx.room.a aVar, Object obj) {
            MultiInstanceInvalidationService.this.f16358x.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends b.a {
        public b() {
        }

        @Override // androidx.room.b
        public void H5(androidx.room.a aVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f16359y) {
                MultiInstanceInvalidationService.this.f16359y.unregister(aVar);
                MultiInstanceInvalidationService.this.f16358x.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.b
        public void X2(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f16359y) {
                String str = MultiInstanceInvalidationService.this.f16358x.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f16359y.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f16359y.getBroadcastCookie(i11)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f16358x.get(Integer.valueOf(intValue));
                    if (i10 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f16359y.getBroadcastItem(i11).c1(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f16359y.finishBroadcast();
            }
        }

        @Override // androidx.room.b
        public int Z3(androidx.room.a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f16359y) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f16357w + 1;
                multiInstanceInvalidationService.f16357w = i10;
                if (multiInstanceInvalidationService.f16359y.register(aVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f16358x.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f16357w--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f16360z;
    }
}
