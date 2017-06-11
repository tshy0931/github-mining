package com.gitmining.analysis.models

/**
  * Created by weiwang on 09/06/17.
  */
object User {

}

case class User(
               id:Long,
               login:String,
               `type`:String="User",
               company:Option[String]=None,
               location:Option[String]=None,
               hireable:Boolean=true,
               createdAt:String, //DateTime,
               updatedAt:String, //DateTime,
               followers:Set[Long]=Set(),
               followersCount:Int=0,
               following:Set[Long]=Set(),
               followingCount:Int=0,
               starred:Set[Long]=Set(),
               starredCount:Int=0,
               subscriptions:Set[Long]=Set(),
               subscriptionsCount:Int=0,
               orgs:Set[Long]=Set(),
               orgsCount:Int=0,
               repos:Set[Long]=Set(),
               reposCount:Int=0
               ) extends Vertex

