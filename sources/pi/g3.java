package pi;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public interface g3 extends IInterface {
    void C4(c cVar) throws RemoteException;

    void C5(na naVar) throws RemoteException;

    List<ea> H3(String str, String str2, String str3, boolean z10) throws RemoteException;

    void J2(Bundle bundle, na naVar) throws RemoteException;

    void R4(ea eaVar, na naVar) throws RemoteException;

    void T2(c cVar, na naVar) throws RemoteException;

    List<c> W3(String str, String str2, String str3) throws RemoteException;

    List<ea> Z0(String str, String str2, boolean z10, na naVar) throws RemoteException;

    void Z1(long j10, String str, String str2, String str3) throws RemoteException;

    List<ea> f1(na naVar, boolean z10) throws RemoteException;

    void i5(na naVar) throws RemoteException;

    byte[] j4(u uVar, String str) throws RemoteException;

    String m2(na naVar) throws RemoteException;

    void n4(na naVar) throws RemoteException;

    void p3(na naVar) throws RemoteException;

    void r1(u uVar, na naVar) throws RemoteException;

    void v4(u uVar, String str, String str2) throws RemoteException;

    List<c> x3(String str, String str2, na naVar) throws RemoteException;
}
