import edu.holycross.shot.cite._
import edu.holycross.shot.ohco2._

// Settings for building a text repository.
val catalog = "editions/catalog.cex"
val citation = "editions/citation.cex"
val editions = "editions"

val corpus = TextRepositorySource.fromFiles(catalog, citation, editions).corpus


// prepare HMT-specific corpus.
// convert Iliad version from va_xml to msA
// for DSE records, merge scholia into top-level scholion URN.
