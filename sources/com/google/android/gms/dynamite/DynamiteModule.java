package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import rh.n;
import rh.p;

/* loaded from: classes3.dex */
public final class DynamiteModule {

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f27234h = null;

    /* renamed from: i  reason: collision with root package name */
    public static String f27235i = null;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f27236j = false;

    /* renamed from: k  reason: collision with root package name */
    public static int f27237k = -1;

    /* renamed from: p  reason: collision with root package name */
    public static zh.h f27242p;

    /* renamed from: q  reason: collision with root package name */
    public static zh.i f27243q;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27244a;

    /* renamed from: l  reason: collision with root package name */
    public static final ThreadLocal<zh.f> f27238l = new ThreadLocal<>();

    /* renamed from: m  reason: collision with root package name */
    public static final ThreadLocal<Long> f27239m = new zh.d();

    /* renamed from: n  reason: collision with root package name */
    public static final a.InterfaceC0239a f27240n = new com.google.android.gms.dynamite.a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f27228b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f27229c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final a f27230d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final a f27231e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final a f27232f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final a f27233g = new g();

    /* renamed from: o  reason: collision with root package name */
    public static final a f27241o = new h();

    @DynamiteApi
    /* loaded from: classes3.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes3.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zh.g gVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, zh.g gVar) {
            super(str, th2);
        }
    }

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0239a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10) throws LoadingException;
        }

        /* loaded from: classes3.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f27245a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f27246b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f27247c = 0;
        }

        b a(Context context, String str, InterfaceC0239a interfaceC0239a) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        p.i(context);
        this.f27244a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(TopicConstant.SEPARATOR);
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!n.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
                sb3.append("Module descriptor id '");
                sb3.append(valueOf);
                sb3.append("' didn't match expected id '");
                sb3.append(str);
                sb3.append("'");
                Log.e("DynamiteModule", sb3.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, a aVar, String str) throws LoadingException {
        Boolean bool;
        yh.a M1;
        DynamiteModule dynamiteModule;
        zh.i iVar;
        Boolean valueOf;
        yh.a z02;
        ThreadLocal<zh.f> threadLocal = f27238l;
        zh.f fVar = threadLocal.get();
        zh.f fVar2 = new zh.f(null);
        threadLocal.set(fVar2);
        ThreadLocal<Long> threadLocal2 = f27239m;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a10 = aVar.a(context, str, f27240n);
            int i10 = a10.f27245a;
            int i11 = a10.f27246b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i10);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            Log.i("DynamiteModule", sb2.toString());
            int i12 = a10.f27247c;
            if (i12 != 0) {
                if (i12 == -1) {
                    if (a10.f27245a != 0) {
                        i12 = -1;
                    }
                }
                if (i12 != 1 || a10.f27246b != 0) {
                    if (i12 == -1) {
                        DynamiteModule h10 = h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = fVar2.f63189a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(fVar);
                        return h10;
                    } else if (i12 == 1) {
                        try {
                            int i13 = a10.f27246b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = f27234h;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i13);
                                        Log.i("DynamiteModule", sb3.toString());
                                        synchronized (DynamiteModule.class) {
                                            iVar = f27243q;
                                        }
                                        if (iVar != null) {
                                            zh.f fVar3 = threadLocal.get();
                                            if (fVar3 != null && fVar3.f63189a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = fVar3.f63189a;
                                                yh.b.h1(null);
                                                synchronized (DynamiteModule.class) {
                                                    valueOf = Boolean.valueOf(f27237k >= 2);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    z02 = iVar.h1(yh.b.h1(applicationContext), str, i13, yh.b.h1(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    z02 = iVar.z0(yh.b.h1(applicationContext), str, i13, yh.b.h1(cursor2));
                                                }
                                                Context context2 = (Context) yh.b.z0(z02);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i13);
                                        Log.i("DynamiteModule", sb4.toString());
                                        zh.h k10 = k(context);
                                        if (k10 != null) {
                                            int c10 = k10.c();
                                            if (c10 >= 3) {
                                                zh.f fVar4 = threadLocal.get();
                                                if (fVar4 != null) {
                                                    M1 = k10.f4(yh.b.h1(context), str, i13, yh.b.h1(fVar4.f63189a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (c10 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                M1 = k10.B4(yh.b.h1(context), str, i13);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                M1 = k10.M1(yh.b.h1(context), str, i13);
                                            }
                                            if (yh.b.z0(M1) != null) {
                                                dynamiteModule = new DynamiteModule((Context) yh.b.z0(M1));
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = fVar2.f63189a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(fVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10, null);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th2) {
                                vh.h.a(context, th2);
                                throw new LoadingException("Failed to load remote module.", th2, null);
                            }
                        } catch (LoadingException e12) {
                            String valueOf2 = String.valueOf(e12.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i14 = a10.f27245a;
                            if (i14 != 0 && aVar.a(context, str, new i(i14, 0)).f27247c == -1) {
                                DynamiteModule h11 = h(context, str);
                                if (longValue == 0) {
                                    f27239m.remove();
                                } else {
                                    f27239m.set(Long.valueOf(longValue));
                                }
                                Cursor cursor4 = fVar2.f63189a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                f27238l.set(fVar);
                                return h11;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e12, null);
                        }
                    } else {
                        StringBuilder sb5 = new StringBuilder(47);
                        sb5.append("VersionPolicy returned invalid code:");
                        sb5.append(i12);
                        throw new LoadingException(sb5.toString(), null);
                    }
                }
            }
            int i15 = a10.f27245a;
            int i16 = a10.f27246b;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 92);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i15);
            sb6.append(" and remote version is ");
            sb6.append(i16);
            sb6.append(TopicConstant.SEPARATOR);
            throw new LoadingException(sb6.toString(), null);
        } catch (Throwable th3) {
            if (longValue == 0) {
                f27239m.remove();
            } else {
                f27239m.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = fVar2.f63189a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f27238l.set(fVar);
            throw th3;
        }
    }

    public static int f(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th2;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f27234h;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String obj = e11.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    i(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else {
                            if (!f27236j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g10 = g(context, str, z10);
                                        String str2 = f27235i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a10 = zh.b.a();
                                            if (a10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f27235i;
                                                    p.i(str3);
                                                    a10 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f27235i;
                                                    p.i(str4);
                                                    a10 = new zh.c(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a10);
                                            declaredField.set(null, a10);
                                            f27234h = bool2;
                                            return g10;
                                        }
                                        return g10;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f27234h = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int i10 = 0;
                if (booleanValue) {
                    try {
                        return g(context, str, z10);
                    } catch (LoadingException e12) {
                        String valueOf = String.valueOf(e12.getMessage());
                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                zh.h k10 = k(context);
                try {
                    if (k10 != null) {
                        try {
                            int c10 = k10.c();
                            if (c10 >= 3) {
                                zh.f fVar = f27238l.get();
                                if (fVar != null && (cursor = fVar.f63189a) != null) {
                                    i10 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) yh.b.z0(k10.k5(yh.b.h1(context), str, z10, f27239m.get().longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                if (i11 <= 0 || !j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            String valueOf2 = String.valueOf(e10.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (c10 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = k10.h1(yh.b.h1(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = k10.z0(yh.b.h1(context), str, z10);
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    }
                    return i10;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            vh.h.a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f27239m     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            if (r10 == 0) goto La0
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r11 == 0) goto La0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f27235i = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f27237k = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = r11
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.f27236j = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = j(r10)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L8e:
            if (r11 != 0) goto L96
            if (r10 == 0) goto L95
            r10.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L9e:
            r11 = move-exception
            goto Lb5
        La0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        Laf:
            r10 = move-exception
            r11 = r10
            goto Lc4
        Lb2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto Lba
            throw r11     // Catch: java.lang.Throwable -> Lc2
        Lba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch: java.lang.Throwable -> Lc2
            throw r12     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r11 = move-exception
            r0 = r10
        Lc4:
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule h(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static void i(ClassLoader classLoader) throws LoadingException {
        zh.i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zh.i) {
                    iVar = (zh.i) queryLocalInterface;
                } else {
                    iVar = new zh.i(iBinder);
                }
            }
            f27243q = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, null);
        }
    }

    public static boolean j(Cursor cursor) {
        zh.f fVar = f27238l.get();
        if (fVar == null || fVar.f63189a != null) {
            return false;
        }
        fVar.f63189a = cursor;
        return true;
    }

    public static zh.h k(Context context) {
        zh.h hVar;
        synchronized (DynamiteModule.class) {
            zh.h hVar2 = f27242p;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof zh.h ? (zh.h) queryLocalInterface : new zh.h(iBinder);
                }
                if (hVar != null) {
                    f27242p = hVar;
                    return hVar;
                }
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public Context b() {
        return this.f27244a;
    }

    public IBinder d(String str) throws LoadingException {
        try {
            return (IBinder) this.f27244a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e10, null);
        }
    }
}
