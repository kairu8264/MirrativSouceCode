package rp;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public interface e extends h0, ReadableByteChannel {
    c A();

    int A1() throws IOException;

    long C0() throws IOException;

    void I0(long j10) throws IOException;

    long O1() throws IOException;

    String P0(long j10) throws IOException;

    InputStream P1();

    String R(long j10) throws IOException;

    f R0(long j10) throws IOException;

    byte[] Z0() throws IOException;

    boolean a1() throws IOException;

    long b0(f0 f0Var) throws IOException;

    boolean c1(long j10, f fVar) throws IOException;

    void k(long j10) throws IOException;

    c l();

    boolean n0(long j10) throws IOException;

    e peek();

    String q1(Charset charset) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    String s0() throws IOException;

    byte[] t0(long j10) throws IOException;

    long w1(f fVar) throws IOException;

    int x1(w wVar) throws IOException;

    short y0() throws IOException;

    long z0(f fVar) throws IOException;
}
