package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import nh.g;
import rh.p;

/* loaded from: classes3.dex */
public abstract class RemoteCreator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f27226a;

    /* renamed from: b  reason: collision with root package name */
    public T f27227b;

    /* loaded from: classes3.dex */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public RemoteCreator(String str) {
        this.f27226a = str;
    }

    public abstract T a(IBinder iBinder);

    public final T b(Context context) throws RemoteCreatorException {
        if (this.f27227b == null) {
            p.i(context);
            Context c10 = g.c(context);
            if (c10 != null) {
                try {
                    this.f27227b = a((IBinder) c10.getClassLoader().loadClass(this.f27226a).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new RemoteCreatorException("Could not load creator class.", e10);
                } catch (IllegalAccessException e11) {
                    throw new RemoteCreatorException("Could not access creator.", e11);
                } catch (InstantiationException e12) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e12);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f27227b;
    }
}
