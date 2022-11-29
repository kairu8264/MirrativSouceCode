package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
public final class h implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0239a interfaceC0239a) throws DynamiteModule.LoadingException {
        int b10;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a10 = interfaceC0239a.a(context, str);
        bVar.f27245a = a10;
        int i10 = 0;
        if (a10 != 0) {
            b10 = interfaceC0239a.b(context, str, false);
            bVar.f27246b = b10;
        } else {
            b10 = interfaceC0239a.b(context, str, true);
            bVar.f27246b = b10;
        }
        int i11 = bVar.f27245a;
        if (i11 != 0) {
            i10 = i11;
        } else if (b10 == 0) {
            bVar.f27247c = 0;
            return bVar;
        }
        if (b10 >= i10) {
            bVar.f27247c = 1;
        } else {
            bVar.f27247c = -1;
        }
        return bVar;
    }
}
