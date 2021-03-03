package Kalkulator;


/**
* Kalkulator/KalkulatorInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Kalkulator.idl
* �roda, 3 marca 2021 12:11:09 CET
*/

public abstract class KalkulatorInterfacePOA extends org.omg.PortableServer.Servant
 implements Kalkulator.KalkulatorInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("add", new java.lang.Integer (0));
    _methods.put ("subtract", new java.lang.Integer (1));
    _methods.put ("multiply", new java.lang.Integer (2));
    _methods.put ("divide", new java.lang.Integer (3));
    _methods.put ("addComplexNumbers", new java.lang.Integer (4));
    _methods.put ("subtractComplexNumbers", new java.lang.Integer (5));
    _methods.put ("multiplyComplexNumbers", new java.lang.Integer (6));
    _methods.put ("divideComplexNumbers", new java.lang.Integer (7));
    _methods.put ("random", new java.lang.Integer (8));
    _methods.put ("shutdown", new java.lang.Integer (9));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Kalkulator/KalkulatorInterface/add
       {
         double x = in.read_double ();
         double y = in.read_double ();
         String $result = null;
         $result = this.add (x, y);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Kalkulator/KalkulatorInterface/subtract
       {
         double a = in.read_double ();
         double b = in.read_double ();
         String $result = null;
         $result = this.subtract (a, b);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // Kalkulator/KalkulatorInterface/multiply
       {
         double x = in.read_double ();
         double y = in.read_double ();
         String $result = null;
         $result = this.multiply (x, y);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // Kalkulator/KalkulatorInterface/divide
       {
         double a = in.read_double ();
         double b = in.read_double ();
         String $result = null;
         $result = this.divide (a, b);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // Kalkulator/KalkulatorInterface/addComplexNumbers
       {
         double xRe = in.read_double ();
         double yRe = in.read_double ();
         double xIm = in.read_double ();
         double yIm = in.read_double ();
         String $result = null;
         $result = this.addComplexNumbers (xRe, yRe, xIm, yIm);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // Kalkulator/KalkulatorInterface/subtractComplexNumbers
       {
         double xRe = in.read_double ();
         double yRe = in.read_double ();
         double xIm = in.read_double ();
         double yIm = in.read_double ();
         String $result = null;
         $result = this.subtractComplexNumbers (xRe, yRe, xIm, yIm);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 6:  // Kalkulator/KalkulatorInterface/multiplyComplexNumbers
       {
         double xRe = in.read_double ();
         double yRe = in.read_double ();
         double xIm = in.read_double ();
         double yIm = in.read_double ();
         String $result = null;
         $result = this.multiplyComplexNumbers (xRe, yRe, xIm, yIm);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 7:  // Kalkulator/KalkulatorInterface/divideComplexNumbers
       {
         double xRe = in.read_double ();
         double yRe = in.read_double ();
         double xIm = in.read_double ();
         double yIm = in.read_double ();
         String $result = null;
         $result = this.divideComplexNumbers (xRe, yRe, xIm, yIm);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 8:  // Kalkulator/KalkulatorInterface/random
       {
         String $result = null;
         $result = this.random ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 9:  // Kalkulator/KalkulatorInterface/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Kalkulator/KalkulatorInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public KalkulatorInterface _this() 
  {
    return KalkulatorInterfaceHelper.narrow(
    super._this_object());
  }

  public KalkulatorInterface _this(org.omg.CORBA.ORB orb) 
  {
    return KalkulatorInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class KalkulatorInterfacePOA
