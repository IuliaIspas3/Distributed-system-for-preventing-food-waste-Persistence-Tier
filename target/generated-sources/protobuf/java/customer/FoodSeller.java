// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodSeller.proto

package customer;

public final class FoodSeller {
  private FoodSeller() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CreategfCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CreategfCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CreategfCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CreategfCustomerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020FoodSeller.proto\022\010customer\"w\n\027Creategf" +
      "CustomerRequest\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tl" +
      "ast_name\030\002 \001(\t\022\024\n\014phone_number\030\003 \001(\t\022\r\n\005" +
      "email\030\004 \001(\t\022\020\n\010password\030\005 \001(\t\"\032\n\030Createg" +
      "fCustomerResponse2l\n\021CustomergfService\022W" +
      "\n\016CreateCustomer\022!.customer.CreategfCust" +
      "omerRequest\032\".customer.CreategfCustomerR" +
      "esponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_customer_CreategfCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_customer_CreategfCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CreategfCustomerRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "PhoneNumber", "Email", "Password", });
    internal_static_customer_CreategfCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_customer_CreategfCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CreategfCustomerResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
