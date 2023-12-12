// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodOfferService.proto

package foodOffer;

public final class FoodOfferServiceOuterClass {
  private FoodOfferServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_CreateFoodOfferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_CreateFoodOfferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_ReadAvailableFoodOffersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_ReadAvailableFoodOffersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_ReadFoodOffersByFoodSellerIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_ReadFoodOffersByFoodSellerIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_ReadFoodOfferByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_ReadFoodOfferByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_UpdateFoodOfferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_UpdateFoodOfferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_DeleteFoodOfferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_DeleteFoodOfferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_FoodOfferEmptyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_FoodOfferEmptyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_ReadFoodOffersListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_ReadFoodOffersListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_foodOffer_ReadFoodOfferByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_foodOffer_ReadFoodOfferByIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FoodOfferService.proto\022\tfoodOffer\"\240\001\n\026" +
      "CreateFoodOfferRequest\022\024\n\014foodSellerId\030\001" +
      " \001(\005\022\r\n\005title\030\002 \001(\t\022\023\n\013description\030\003 \001(\t" +
      "\022\r\n\005price\030\004 \001(\001\022\027\n\017startPickUpTime\030\005 \001(\t" +
      "\022\025\n\rendPickUpTime\030\006 \001(\t\022\r\n\005photo\030\007 \001(\t\" " +
      "\n\036ReadAvailableFoodOffersRequest\";\n#Read" +
      "FoodOffersByFoodSellerIdRequest\022\024\n\014foodS" +
      "ellerId\030\001 \001(\005\"&\n\030ReadFoodOfferByIdReques" +
      "t\022\n\n\002id\030\001 \001(\005\"\220\001\n\026UpdateFoodOfferRequest" +
      "\022\023\n\013foodOfferId\030\001 \001(\005\022\r\n\005title\030\002 \001(\t\022\023\n\013",
      "description\030\003 \001(\t\022\r\n\005price\030\004 \001(\001\022\027\n\017star" +
      "tPickUpTime\030\005 \001(\t\022\025\n\rendPickUpTime\030\006 \001(\t" +
      "\"-\n\026DeleteFoodOfferRequest\022\023\n\013foodOfferI" +
      "d\030\001 \001(\005\"\030\n\026FoodOfferEmptyResponse\"*\n\032Rea" +
      "dFoodOffersListResponse\022\014\n\004list\030\001 \001(\t\"\326\001" +
      "\n\031ReadFoodOfferByIdResponse\022\n\n\002id\030\001 \001(\005\022" +
      "\022\n\nfoodSeller\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\023\n\013de" +
      "scription\030\004 \001(\t\022\r\n\005price\030\005 \001(\001\022\027\n\017startP" +
      "ickUpTime\030\006 \001(\t\022\025\n\rendPickUpTime\030\007 \001(\t\022\022" +
      "\n\nisReserved\030\n \001(\010\022\023\n\013isCompleted\030\013 \001(\010\022",
      "\r\n\005photo\030\014 \001(\t2\341\004\n\020FoodOfferService\022W\n\017c" +
      "reateFoodOffer\022!.foodOffer.CreateFoodOff" +
      "erRequest\032!.foodOffer.FoodOfferEmptyResp" +
      "onse\022k\n\027readAvailableFoodOffers\022).foodOf" +
      "fer.ReadAvailableFoodOffersRequest\032%.foo" +
      "dOffer.ReadFoodOffersListResponse\022u\n\034rea" +
      "dFoodOffersByFoodSellerId\022..foodOffer.Re" +
      "adFoodOffersByFoodSellerIdRequest\032%.food" +
      "Offer.ReadFoodOffersListResponse\022W\n\017upda" +
      "teFoodOffer\022!.foodOffer.UpdateFoodOfferR",
      "equest\032!.foodOffer.FoodOfferEmptyRespons" +
      "e\022W\n\017deleteFoodOffer\022!.foodOffer.DeleteF" +
      "oodOfferRequest\032!.foodOffer.FoodOfferEmp" +
      "tyResponse\022^\n\021readFoodOfferById\022#.foodOf" +
      "fer.ReadFoodOfferByIdRequest\032$.foodOffer" +
      ".ReadFoodOfferByIdResponseB\002P\001b\006proto3"
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
    internal_static_foodOffer_CreateFoodOfferRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_foodOffer_CreateFoodOfferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_CreateFoodOfferRequest_descriptor,
        new java.lang.String[] { "FoodSellerId", "Title", "Description", "Price", "StartPickUpTime", "EndPickUpTime", "Photo", });
    internal_static_foodOffer_ReadAvailableFoodOffersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_foodOffer_ReadAvailableFoodOffersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_ReadAvailableFoodOffersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_foodOffer_ReadFoodOffersByFoodSellerIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_foodOffer_ReadFoodOffersByFoodSellerIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_ReadFoodOffersByFoodSellerIdRequest_descriptor,
        new java.lang.String[] { "FoodSellerId", });
    internal_static_foodOffer_ReadFoodOfferByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_foodOffer_ReadFoodOfferByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_ReadFoodOfferByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_foodOffer_UpdateFoodOfferRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_foodOffer_UpdateFoodOfferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_UpdateFoodOfferRequest_descriptor,
        new java.lang.String[] { "FoodOfferId", "Title", "Description", "Price", "StartPickUpTime", "EndPickUpTime", });
    internal_static_foodOffer_DeleteFoodOfferRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_foodOffer_DeleteFoodOfferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_DeleteFoodOfferRequest_descriptor,
        new java.lang.String[] { "FoodOfferId", });
    internal_static_foodOffer_FoodOfferEmptyResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_foodOffer_FoodOfferEmptyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_FoodOfferEmptyResponse_descriptor,
        new java.lang.String[] { });
    internal_static_foodOffer_ReadFoodOffersListResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_foodOffer_ReadFoodOffersListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_ReadFoodOffersListResponse_descriptor,
        new java.lang.String[] { "List", });
    internal_static_foodOffer_ReadFoodOfferByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_foodOffer_ReadFoodOfferByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_foodOffer_ReadFoodOfferByIdResponse_descriptor,
        new java.lang.String[] { "Id", "FoodSeller", "Title", "Description", "Price", "StartPickUpTime", "EndPickUpTime", "IsReserved", "IsCompleted", "Photo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
