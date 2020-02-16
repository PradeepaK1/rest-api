package com.example.rrice.Megaman.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
public class bosses {
 @Id
 public ObjectId _id;
 public String name;
 public String weapon;
 public String weakness;
 
 // Constructors
 public bosses() {}
 public bosses(ObjectId _id, String name, String weapon, String weakness) {
  this._id = _id;
  this.name = name;
  this.weapon = weapon;
  this.weakness = weakness;
 }
 
 // ObjectId needs to be converted to string
 public String get_id() {
  return _id.toHexString();
 }
 public void set_id(ObjectId _id) {
  this._id = _id;
 }
 
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 
 public String getWeapon() {
  return weapon;
 }
 public void setWeapon(String weapon) {
  this.weapon = weapon;
 }
 
 public String getWeakness() {
  return weakness;
 }
 public void setWeakness(String weakness) {
  this.weakness = weakness;
 }
}