package ak;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class u2 implements u4 {

    /* renamed from: i  reason: collision with root package name */
    public static final dk.f f13666i = new dk.f("FakeAssetPackService");

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicInteger f13667j = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f13668a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f13669b;

    /* renamed from: c  reason: collision with root package name */
    public final t1 f13670c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f13671d;

    /* renamed from: e  reason: collision with root package name */
    public final k3 f13672e;

    /* renamed from: f  reason: collision with root package name */
    public final dk.b0<Executor> f13673f;

    /* renamed from: g  reason: collision with root package name */
    public final i3 f13674g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f13675h = new Handler(Looper.getMainLooper());

    public u2(File file, i0 i0Var, t1 t1Var, Context context, k3 k3Var, dk.b0<Executor> b0Var, i3 i3Var) {
        this.f13668a = file.getAbsolutePath();
        this.f13669b = i0Var;
        this.f13670c = t1Var;
        this.f13671d = context;
        this.f13672e = k3Var;
        this.f13673f = b0Var;
        this.f13674g = i3Var;
    }

    public static long i(int i10, long j10) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return j10;
            }
            return 0L;
        }
        return j10 / 2;
    }

    public static String p(File file) throws LocalTestingException {
        try {
            return w2.a(Arrays.asList(file));
        } catch (IOException e10) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e11);
        }
    }

    @Override // ak.u4
    public final void a() {
        f13666i.d("keepAlive", new Object[0]);
    }

    @Override // ak.u4
    public final void b(final int i10, final String str) {
        f13666i.d("notifyModuleCompleted", new Object[0]);
        this.f13673f.zza().execute(new Runnable() { // from class: ak.q2
            @Override // java.lang.Runnable
            public final void run() {
                u2.this.l(i10, str);
            }
        });
    }

    @Override // ak.u4
    public final jk.d<ParcelFileDescriptor> c(int i10, String str, String str2, int i11) {
        File[] q10;
        int i12;
        f13666i.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i10), str, str2, Integer.valueOf(i11));
        jk.o oVar = new jk.o();
        try {
        } catch (LocalTestingException e10) {
            f13666i.e("getChunkFileDescriptor failed", e10);
            oVar.b(e10);
        } catch (FileNotFoundException e11) {
            f13666i.e("getChunkFileDescriptor failed", e11);
            oVar.b(new LocalTestingException("Asset Slice file not found.", e11));
        }
        for (File file : q(str)) {
            if (dk.x.a(file).equals(str2)) {
                oVar.c(ParcelFileDescriptor.open(file, 268435456));
                return oVar.a();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // ak.u4
    public final jk.d<e> d(final List<String> list, final List<String> list2, Map<String, Long> map) {
        f13666i.d("startDownload(%s)", list2);
        final jk.o oVar = new jk.o();
        this.f13673f.zza().execute(new Runnable() { // from class: ak.t2
            @Override // java.lang.Runnable
            public final void run() {
                u2.this.m(list2, oVar, list);
            }
        });
        return oVar.a();
    }

    @Override // ak.u4
    public final jk.d<e> e(final List<String> list, final l0 l0Var, Map<String, Long> map) {
        f13666i.d("getPackStates(%s)", list);
        final jk.o oVar = new jk.o();
        this.f13673f.zza().execute(new Runnable() { // from class: ak.s2
            @Override // java.lang.Runnable
            public final void run() {
                u2.this.k(list, l0Var, oVar);
            }
        });
        return oVar.a();
    }

    @Override // ak.u4
    public final void f(int i10, String str, String str2, int i11) {
        f13666i.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // ak.u4
    public final jk.d<List<String>> g(Map<String, Long> map) {
        f13666i.d("syncPacks()", new Object[0]);
        return jk.f.c(new ArrayList());
    }

    @Override // ak.u4
    public final void h(String str) {
        f13666i.d("removePack(%s)", str);
    }

    public final /* synthetic */ void j(Intent intent) {
        this.f13669b.a(this.f13671d, intent);
    }

    public final /* synthetic */ void k(List list, l0 l0Var, jk.o oVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState o10 = o(str, ((g3) l0Var).f13376a.i(8, str));
                j10 += o10.e();
                hashMap.put(str, o10);
            } catch (LocalTestingException e10) {
                oVar.b(e10);
                return;
            }
        }
        oVar.c(new u0(j10, hashMap));
    }

    public final /* synthetic */ void l(int i10, String str) {
        try {
            n(i10, str, 4);
        } catch (LocalTestingException e10) {
            f13666i.e("notifyModuleCompleted failed", e10);
        }
    }

    public final /* synthetic */ void m(List list, jk.o oVar, List list2) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState o10 = o(str, 1);
                j10 += o10.e();
                hashMap.put(str, o10);
            } catch (LocalTestingException e10) {
                oVar.b(e10);
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                int andIncrement = f13667j.getAndIncrement();
                n(andIncrement, str2, 1);
                n(andIncrement, str2, 2);
                n(andIncrement, str2, 3);
            } catch (LocalTestingException e11) {
                oVar.b(e11);
                return;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            hashMap.put(str3, AssetPackState.h(str3, 4, 0, 0L, 0L, 0.0d, 1, String.valueOf(this.f13672e.a()), String.valueOf(this.f13672e.a())));
        }
        oVar.c(new u0(j10, hashMap));
    }

    public final Bundle n(int i10, String str, int i11) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f13672e.a());
        bundle.putInt("session_id", i10);
        File[] q10 = q(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j10 = 0;
        for (File file : q10) {
            j10 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i11 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a10 = dk.x.a(file);
            bundle.putParcelableArrayList(bk.b.b("chunk_intents", str, a10), arrayList2);
            bundle.putString(bk.b.b("uncompressed_hash_sha256", str, a10), p(file));
            bundle.putLong(bk.b.b("uncompressed_size", str, a10), file.length());
            arrayList.add(a10);
        }
        bundle.putStringArrayList(bk.b.a("slice_ids", str), arrayList);
        bundle.putLong(bk.b.a("pack_version", str), this.f13672e.a());
        bundle.putInt(bk.b.a("status", str), i11);
        bundle.putInt(bk.b.a("error_code", str), 0);
        bundle.putLong(bk.b.a("bytes_downloaded", str), i(i11, j10));
        bundle.putLong(bk.b.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", i(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f13675h.post(new Runnable() { // from class: ak.r2
            @Override // java.lang.Runnable
            public final void run() {
                u2.this.j(putExtra);
            }
        });
        return bundle;
    }

    public final AssetPackState o(String str, int i10) throws LocalTestingException {
        long j10 = 0;
        for (File file : q(str)) {
            j10 += file.length();
        }
        return AssetPackState.h(str, i10, 0, i(i10, j10), j10, this.f13670c.a(str), 1, String.valueOf(this.f13672e.a()), this.f13674g.a(str));
    }

    public final File[] q(final String str) throws LocalTestingException {
        File file = new File(this.f13668a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: ak.p2
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (dk.x.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // ak.u4
    public final void q0(int i10) {
        f13666i.d("notifySessionFailed", new Object[0]);
    }

    @Override // ak.u4
    public final void v0(List<String> list) {
        f13666i.d("cancelDownload(%s)", list);
    }
}
