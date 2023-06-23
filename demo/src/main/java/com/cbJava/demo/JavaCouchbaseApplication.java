package com.cbJava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.couchbase.client.core.error.CouchbaseException;
import com.couchbase.client.core.error.DocumentExistsException;
import com.couchbase.client.core.error.DocumentNotFoundException;
import com.couchbase.client.core.error.UnambiguousTimeoutException;
import com.couchbase.client.java.*;
import com.couchbase.client.java.kv.*;
import com.couchbase.client.java.query.QueryResult;
import com.couchbase.client.java.json.*;
import java.time.Duration;

@SpringBootApplication
public class JavaCouchbaseApplication {

	 static String connectionString = "couchbases://cb.q04w7wrh1jopu2nr.cloud.couchbase.com";
	  static String username = "vinaymandava25@gmail.com";
	  static String password = "Vinjay@20";
	  static String bucketName = "travel-sample";

	  public static void main(String... args) {
	    // tag::connect[]
	    Cluster cluster = Cluster.connect(connectionString, username, password);
	    // end::connect[]

	    // tag::bucket[]
	    // get a bucket reference
	    Bucket bucket = cluster.bucket(bucketName);
	    // end::bucket[]

	    // tag::collection[]
	    // get a user defined collection reference
	    Scope scope = bucket.scope("tenant_agent_00");
	    Collection collection = scope.collection("users");
	    GetResult result = collection.get("0");
	    System.out.println(result);
	  }

		

}
