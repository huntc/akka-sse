/*
 * Copyright 2014 Heiko Seeberger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.heikoseeberger

package object akkasse {

  //format: OFF
  private[akkasse] type Traversable[+A] = scala.collection.immutable.Traversable[A]

  private[akkasse] type Iterable[+A] = scala.collection.immutable.Iterable[A]

  private[akkasse] type Seq[+A] = scala.collection.immutable.Seq[A]

  private[akkasse] type IndexedSeq[+A] = scala.collection.immutable.IndexedSeq[A]
  //format: ON
}
