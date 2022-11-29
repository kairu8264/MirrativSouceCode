package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AssetPackManagerWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static AssetPackManagerWrapper f28301a;

    /* renamed from: b  reason: collision with root package name */
    private ak.b f28302b;

    /* renamed from: c  reason: collision with root package name */
    private HashSet f28303c;

    /* renamed from: d  reason: collision with root package name */
    private Object f28304d;

    /* loaded from: classes4.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Set f28305a;

        /* renamed from: b  reason: collision with root package name */
        private String f28306b;

        /* renamed from: c  reason: collision with root package name */
        private int f28307c;

        /* renamed from: d  reason: collision with root package name */
        private long f28308d;

        /* renamed from: e  reason: collision with root package name */
        private long f28309e;

        /* renamed from: f  reason: collision with root package name */
        private int f28310f;

        /* renamed from: g  reason: collision with root package name */
        private int f28311g;

        public a(Set set, String str, int i10, long j10, long j11, int i11, int i12) {
            this.f28305a = set;
            this.f28306b = str;
            this.f28307c = i10;
            this.f28308d = j10;
            this.f28309e = j11;
            this.f28310f = i11;
            this.f28311g = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback : this.f28305a) {
                iAssetPackManagerDownloadStatusCallback.onStatusUpdate(this.f28306b, this.f28307c, this.f28308d, this.f28309e, this.f28310f, this.f28311g);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements ak.d {

        /* renamed from: b  reason: collision with root package name */
        private HashSet f28313b;

        /* renamed from: c  reason: collision with root package name */
        private Looper f28314c;

        public b(AssetPackManagerWrapper assetPackManagerWrapper, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
            this(iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        }

        public b(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
            HashSet hashSet = new HashSet();
            this.f28313b = hashSet;
            hashSet.add(iAssetPackManagerDownloadStatusCallback);
            this.f28314c = looper;
        }

        private static Set a(HashSet hashSet) {
            return (Set) hashSet.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // fk.a
        /* renamed from: a */
        public synchronized void onStateUpdate(AssetPackState assetPackState) {
            if (assetPackState.d() == 4 || assetPackState.d() == 5 || assetPackState.d() == 0) {
                synchronized (AssetPackManagerWrapper.f28301a) {
                    AssetPackManagerWrapper.this.f28303c.remove(assetPackState.c());
                    if (AssetPackManagerWrapper.this.f28303c.isEmpty()) {
                        AssetPackManagerWrapper assetPackManagerWrapper = AssetPackManagerWrapper.this;
                        assetPackManagerWrapper.unregisterDownloadStatusListener(assetPackManagerWrapper.f28304d);
                        AssetPackManagerWrapper.this.f28304d = null;
                    }
                }
            }
            if (this.f28313b.size() == 0) {
                return;
            }
            new Handler(this.f28314c).post(new a(a(this.f28313b), assetPackState.c(), assetPackState.d(), assetPackState.e(), assetPackState.a(), assetPackState.f(), assetPackState.b()));
        }

        public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
            this.f28313b.add(iAssetPackManagerDownloadStatusCallback);
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements jk.c {

        /* renamed from: a  reason: collision with root package name */
        private IAssetPackManagerMobileDataConfirmationCallback f28315a;

        /* renamed from: b  reason: collision with root package name */
        private Looper f28316b = Looper.myLooper();

        /* loaded from: classes4.dex */
        public static class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private IAssetPackManagerMobileDataConfirmationCallback f28317a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f28318b;

            public a(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z10) {
                this.f28317a = iAssetPackManagerMobileDataConfirmationCallback;
                this.f28318b = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28317a.onMobileDataConfirmationResult(this.f28318b);
            }
        }

        public c(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
            this.f28315a = iAssetPackManagerMobileDataConfirmationCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // jk.c
        /* renamed from: a */
        public void onSuccess(Integer num) {
            if (this.f28315a != null) {
                new Handler(this.f28316b).post(new a(this.f28315a, num.intValue() == -1));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class d implements jk.a {

        /* renamed from: a  reason: collision with root package name */
        private IAssetPackManagerDownloadStatusCallback f28319a;

        /* renamed from: b  reason: collision with root package name */
        private Looper f28320b = Looper.myLooper();

        /* renamed from: c  reason: collision with root package name */
        private String f28321c;

        public d(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String str) {
            this.f28319a = iAssetPackManagerDownloadStatusCallback;
            this.f28321c = str;
        }

        private void a(String str, int i10, int i11, long j10) {
            new Handler(this.f28320b).post(new a(Collections.singleton(this.f28319a), str, i10, j10, i10 == 4 ? j10 : 0L, 0, i11));
        }

        @Override // jk.a
        public final void onComplete(jk.d dVar) {
            try {
                ak.e eVar = (ak.e) dVar.g();
                Map<String, AssetPackState> a10 = eVar.a();
                if (a10.size() == 0) {
                    return;
                }
                for (AssetPackState assetPackState : a10.values()) {
                    if (assetPackState.b() != 0 || assetPackState.d() == 4 || assetPackState.d() == 5 || assetPackState.d() == 0) {
                        a(assetPackState.c(), assetPackState.d(), assetPackState.b(), eVar.b());
                    } else {
                        AssetPackManagerWrapper.f28301a.a(assetPackState.c(), this.f28319a, this.f28320b);
                    }
                }
            } catch (RuntimeExecutionException e10) {
                a(this.f28321c, 0, e10.a(), 0L);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e implements jk.a {

        /* renamed from: a  reason: collision with root package name */
        private IAssetPackManagerStatusQueryCallback f28322a;

        /* renamed from: b  reason: collision with root package name */
        private Looper f28323b = Looper.myLooper();

        /* renamed from: c  reason: collision with root package name */
        private String[] f28324c;

        /* loaded from: classes4.dex */
        public static class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private IAssetPackManagerStatusQueryCallback f28325a;

            /* renamed from: b  reason: collision with root package name */
            private long f28326b;

            /* renamed from: c  reason: collision with root package name */
            private String[] f28327c;

            /* renamed from: d  reason: collision with root package name */
            private int[] f28328d;

            /* renamed from: e  reason: collision with root package name */
            private int[] f28329e;

            public a(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j10, String[] strArr, int[] iArr, int[] iArr2) {
                this.f28325a = iAssetPackManagerStatusQueryCallback;
                this.f28326b = j10;
                this.f28327c = strArr;
                this.f28328d = iArr;
                this.f28329e = iArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f28325a.onStatusResult(this.f28326b, this.f28327c, this.f28328d, this.f28329e);
            }
        }

        public e(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
            this.f28322a = iAssetPackManagerStatusQueryCallback;
            this.f28324c = strArr;
        }

        @Override // jk.a
        public final void onComplete(jk.d dVar) {
            String[] strArr;
            if (this.f28322a == null) {
                return;
            }
            int i10 = 0;
            try {
                ak.e eVar = (ak.e) dVar.g();
                Map<String, AssetPackState> a10 = eVar.a();
                int size = a10.size();
                String[] strArr2 = new String[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                for (AssetPackState assetPackState : a10.values()) {
                    strArr2[i10] = assetPackState.c();
                    iArr[i10] = assetPackState.d();
                    iArr2[i10] = assetPackState.b();
                    i10++;
                }
                new Handler(this.f28323b).post(new a(this.f28322a, eVar.b(), strArr2, iArr, iArr2));
            } catch (RuntimeExecutionException e10) {
                String message = e10.getMessage();
                for (String str : this.f28324c) {
                    if (message.contains(str)) {
                        new Handler(this.f28323b).post(new a(this.f28322a, 0L, new String[]{str}, new int[]{0}, new int[]{e10.a()}));
                        return;
                    }
                }
                String[] strArr3 = this.f28324c;
                int[] iArr3 = new int[strArr3.length];
                int[] iArr4 = new int[strArr3.length];
                for (int i11 = 0; i11 < this.f28324c.length; i11++) {
                    iArr3[i11] = 0;
                    iArr4[i11] = e10.a();
                }
                new Handler(this.f28323b).post(new a(this.f28322a, 0L, this.f28324c, iArr3, iArr4));
            }
        }
    }

    private AssetPackManagerWrapper(Context context) {
        if (f28301a != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            this.f28302b = ak.c.a(context);
        } catch (NoClassDefFoundError unused) {
            this.f28302b = null;
        }
        this.f28303c = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        synchronized (f28301a) {
            Object obj = this.f28304d;
            if (obj == null) {
                b bVar = new b(iAssetPackManagerDownloadStatusCallback, looper);
                this.f28302b.h(bVar);
                this.f28304d = bVar;
            } else {
                ((b) obj).a(iAssetPackManagerDownloadStatusCallback);
            }
            this.f28303c.add(str);
            this.f28302b.b(Collections.singletonList(str));
        }
    }

    private void b() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes \"com.google.android.play:core\" dependency.");
        }
    }

    public static synchronized AssetPackManagerWrapper getInstance() {
        AssetPackManagerWrapper assetPackManagerWrapper;
        synchronized (AssetPackManagerWrapper.class) {
            while (true) {
                assetPackManagerWrapper = f28301a;
                if (assetPackManagerWrapper != null) {
                    break;
                }
                try {
                    AssetPackManagerWrapper.class.wait(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
                } catch (InterruptedException e10) {
                    com.unity3d.player.d.Log(6, e10.getMessage());
                }
            }
            if (assetPackManagerWrapper == null) {
                throw new RuntimeException("AssetPackManagerWrapper is not yet initialised.");
            }
        }
        return assetPackManagerWrapper;
    }

    public static synchronized AssetPackManagerWrapper init(Context context) {
        AssetPackManagerWrapper assetPackManagerWrapper;
        synchronized (AssetPackManagerWrapper.class) {
            if (f28301a != null) {
                throw new RuntimeException("AssetPackManagerWrapper.init() should be called only once. Use getInstance() instead.");
            }
            f28301a = new AssetPackManagerWrapper(context);
            AssetPackManagerWrapper.class.notifyAll();
            assetPackManagerWrapper = f28301a;
        }
        return assetPackManagerWrapper;
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        b();
        this.f28302b.f(Arrays.asList(strArr));
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        b();
        for (String str : strArr) {
            this.f28302b.g(Collections.singletonList(str)).a(new d(iAssetPackManagerDownloadStatusCallback, str));
        }
    }

    public String getAssetPackPath(String str) {
        b();
        ak.a c10 = this.f28302b.c(str);
        return c10 == null ? "" : c10.a();
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        b();
        this.f28302b.g(Arrays.asList(strArr)).a(new e(iAssetPackManagerStatusQueryCallback, strArr));
    }

    public boolean playCoreApiMissing() {
        return this.f28302b == null;
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        b();
        b bVar = new b(this, iAssetPackManagerDownloadStatusCallback);
        this.f28302b.h(bVar);
        return bVar;
    }

    public void removeAssetPack(String str) {
        b();
        this.f28302b.e(str);
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        b();
        this.f28302b.a(activity).e(new c(iAssetPackManagerMobileDataConfirmationCallback));
    }

    public void unregisterDownloadStatusListener(Object obj) {
        b();
        if (obj instanceof b) {
            this.f28302b.d((b) obj);
        }
    }
}
