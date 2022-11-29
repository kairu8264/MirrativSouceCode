package wo;

/* loaded from: classes4.dex */
public final class d0<E> extends c0<E> {
    public final io.l<E, wn.v> B;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(E e10, uo.p<? super wn.v> pVar, io.l<? super E, wn.v> lVar) {
        super(e10, pVar);
        this.B = lVar;
    }

    @Override // zo.u
    public boolean K() {
        if (super.K()) {
            W();
            return true;
        }
        return false;
    }

    @Override // wo.a0
    public void W() {
        zo.c0.b(this.B, S(), this.A.getContext());
    }
}
